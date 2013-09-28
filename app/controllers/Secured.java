package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: KJA
 * Date: 9/28/13
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
}
