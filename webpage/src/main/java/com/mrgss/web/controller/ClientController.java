package com.mrgss.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mrgss.web.persistence.model.ClientEntity;
import com.mrgss.web.persistence.model.DocTypeEntity;
import com.mrgss.web.persistence.model.UserEntity;
import com.mrgss.web.persistence.repository.DocTypeRepository;
import com.mrgss.web.services.ClientService;

@Controller
@SessionAttributes("user")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@Autowired
	DocTypeRepository repositoryDocType;

	@RequestMapping(value = "/new-client-form", method = RequestMethod.GET)
	public ModelAndView newClientForm() {
		ModelAndView model = new ModelAndView();
		model.setViewName("new-client");
		return model;
	}

	@RequestMapping(value = "/new-client", method = RequestMethod.POST)
	public ModelAndView newClient(@RequestParam("doc") Long doc,
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("mail") String mail,
			@RequestParam("phone") Long phone,
			@RequestParam("genderView") String genderView, ModelAndView model,
			HttpSession session) {

		UserEntity user = (UserEntity) session.getAttribute("user");

		if (!user.getRole().getName().equalsIgnoreCase("client")) {
			DocTypeEntity docType = newDocType();
			Boolean gender = true;
			if (genderView.equalsIgnoreCase("0")) {
				gender = false;
			}
			ClientEntity client = clientService.newClient(docType, doc,
					firstname, lastname, mail, phone, gender);
			model.addObject("client", client);
			model.setViewName("success");
		} else {
			model.setViewName("error");
		}

		return model;
	}

	private DocTypeEntity newDocType() {
		DocTypeEntity docType = new DocTypeEntity();
		docType.setName("DNI");
		docType = repositoryDocType.save(docType);

		return docType;
	}

	@RequestMapping(value = "/list-client", method = RequestMethod.GET)
	public ModelAndView listClient(ModelAndView model) {

		List<ClientEntity> listClient = clientService.listClient();
		model.addObject("clients", listClient);
		model.setViewName("list-client");
		return model;
	}

	@RequestMapping(value = "/update-client", method = RequestMethod.POST)
	public ModelAndView updateClient(@RequestParam("userName") String username,
			@RequestParam("password") String password, ModelAndView model) {
		return model;
	}
}
