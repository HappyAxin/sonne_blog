package sonn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sonn.entity.Article;
import sonn.entity.User;
import sonn.service.ArticleService;
import sonn.util.Page;
import sonn.util.PageInfo;
import sonn.util.Principal;


/**
* @ClassName: MySpaceController 
* @Description: ���˿ռ�
* @author ����
* @date 2016-5-21 ����6:38:00 
* @version 1.0
 */
@Controller
@RequestMapping("/space")
public class MySpaceController 
{
    @Resource(name = "articleServiceImpl")
    private ArticleService articleService;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String mySpace(HttpServletRequest request,PageInfo pageInfo,Model model) throws Exception
    {
		HttpSession session = request.getSession();
		//��ȡ��¼�û�
		Principal userPrincipal =
				(Principal) session. getAttribute(User.PRINCIPAL_ATTRIBUTE_NAME);
		pageInfo.setEveryPage(12);
		String userName = userPrincipal.getUsername();
        Page<Article> page = articleService.getArticlesByUsername(userName, pageInfo);
       	model.addAttribute("page",page);
       	model.addAttribute("userName",userName);
        return "mySpace";
    }
}
