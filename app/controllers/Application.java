package controllers;

import models.*;
import play.*;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    private int ags;

    public static Result main(Html content) {return ok(main.render(content)); }
    public static Result index() {return main(head.render());}
    public static Result menu() {return main(menu.render() );}
    public static Result showFood() {
        Food f1 =new Food("F001","ผัดกระเพราหมูสับ","ผัด","M",35,1);
        Food f2 =new Food("F002","ผัดกระเพราไก่","ผัด","M",35,1);
        Food f3 =new Food("F003","ผัดคะน้าหมูกรอบ","ผัด","M",35,1);
        Food f4 =new Food("F001","ผัดกระเพราหมูสับ","ผัด","M",35,1);
        Food f5 =new Food("F002","ผัดกระเพราไก่","ผัด","M",35,1);
        Food f6=new Food("F003","ผัดพริกแกงหมู","ผัด","M",35,1);
        return main(showFood .render(f1,f2,f3,f4,f5,f6));
    }

    }


















