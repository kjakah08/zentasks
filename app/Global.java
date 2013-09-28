/**
 * Created with IntelliJ IDEA.
 * User: KJA
 * Date: 9/27/13
 * Time: 9:51 PM
 * To change this template use File | Settings | File Templates.
 */

import play.*;
import play.libs.*;
import com.avaje.ebean.Ebean;
import models.*;
import java.util.*;

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        // Check if the database is empty
        if (User.find.findRowCount() == 0) {
            Ebean.save((List) Yaml.load("initial-data.yml"));
        }
    }
}