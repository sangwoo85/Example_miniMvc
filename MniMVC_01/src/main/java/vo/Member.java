package vo;

import java.util.Date;

public class Member {

    private int mno;
    private String mname;
    private String pwd;
    private String email;
    private Date cre_date;
    private Date mod_date;


    public String getEmail() {
        return email;
    }

    public Member setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getMno() {
        return mno;
    }

    public Member setMno(int mno) {
        this.mno = mno;
        return this;
    }

    public String getMname() {
        return mname;
    }

    public Member setMname(String mname) {
        this.mname = mname;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public Member setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public Date getCre_date() {
        return cre_date;
    }

    public Member setCre_date(Date cre_date) {
        this.cre_date = cre_date;
        return this;
    }

    public Date getMod_date() {
        return mod_date;
    }

    public Member setMod_date(Date mod_date) {
        this.mod_date = mod_date;
        return this;
    }
}
