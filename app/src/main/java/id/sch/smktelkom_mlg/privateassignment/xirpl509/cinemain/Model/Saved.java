package id.sch.smktelkom_mlg.privateassignment.xirpl509.cinemain.Model;

/**
 * Created by King Pin on 6/13/2017.
 */

public class Saved {
    String title;
    String desc;

    public Saved() {
    }

    public Saved(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
