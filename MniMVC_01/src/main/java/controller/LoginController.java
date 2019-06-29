package controller;

import Annotation.Component;
import bind.DataBinding;
import dao.MemberDao;
import vo.Member;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Component("/login.do")
public class LoginController implements Controller, DataBinding {


    MemberDao memberDao;

    public LoginController setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
        return this;
    }

    @Override
    public Object[] getDataBinders() {
        return new Object[]{"loginInfo", vo.Member.class};
    }

    @Override
    public String execute(Map<String, Object> model) throws Exception {
        Member loginInfo = (Member)model.get("loginInfo");

        if(loginInfo.getEmail()==null){
            return "/auth/LoginForm.jsp";
        }else {
            Member member = memberDao.exist(
                    loginInfo.getEmail(),
                    loginInfo.getPwd());
            if(member!=null){
                HttpSession session =  (HttpSession)model.get("session");
                session.setAttribute("member", member);
                return "redirect:../member/list.do";
            }else{
                return "auth/LoginFail.jsp";
            }

        }
    }
}
