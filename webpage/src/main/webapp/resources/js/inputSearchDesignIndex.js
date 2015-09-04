// Efecto abrir campo de texto para busqueda

$(document).ready(function () { 
    $('#btn_search').click(function()
    {
      $("#area_search").css({
        "height": "2.3em",
      "border": "0",
          "transition": "all 0.2s ease-in-out",
      "visibility": "visible",
          "background-color": "rgba(255, 255, 255, 0.09)",
        "width": "12em",
          "color": "#fff"
      });
      $("#btn_search").css({
          "background-color": "transparent"
      });
    });
});