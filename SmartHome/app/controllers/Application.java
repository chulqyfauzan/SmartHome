package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.Sensor_Model;

public class Application extends Controller {

    public static Result index() {
        Sensor_Model sensor = new Sensor_Model();
        return ok(views.html.index.render());
    }

}
