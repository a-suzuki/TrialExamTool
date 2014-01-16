package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
    	List<User> user = User.find.all();
        return ok(index.render("ユーザー一覧", user));
    }

}
