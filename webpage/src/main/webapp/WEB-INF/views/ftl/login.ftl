<#import "macros.ftl" as macros/>
<@macros.load_css src="${renderRequest.getContextPath()}"/>
<div class="container">
  <div class="row">
    <h1 class="text-center">Login Screen Using Bootstrap</h1>
    <div class="login-wrap">
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label for="inputEmail3" class="col-sm-3 control-label">
            UserName</label>
          <div class="col-sm-9">
            <input type="email" class="form-control" id="inputUser" placeholder="UserName" required>
          </div>
        </div>
        <div class="form-group">
          <label for="inputPassword3" class="col-sm-3 control-label">
            Password</label>
          <div class="col-sm-9">
            <input type="password" class="form-control" id="inputPsw" placeholder="Password" required>
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-3 col-sm-9">
            <div class="checkbox">
              <label>
                <input type="checkbox" /> Remember me
              </label>
            </div>
          </div>
        </div>
        <div class="form-group last">
          <div class="col-sm-offset-3 col-sm-9">
            <button type="submit" class="btn btn-success btn-sm">
              Sign in</button>
            <button type="reset" class="btn btn-default btn-sm">
              Reset</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>

<@macros.load_js src="${renderRequest.getContextPath()}"/>