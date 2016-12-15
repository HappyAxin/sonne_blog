package sonn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sonn.entity.Article;
import sonn.entity.User;
import sonn.service.ArticleService;
import sonn.service.UserService;
import sonn.util.IOUtill;
import sonn.util.Page;
import sonn.util.PageInfo;
import sonn.util.TimeUtils;


/**
* @ClassName: MySpaceController 
* @Description: personal space
* @author sonne
* @date 2016-5-21 ����6:38:00 
*       2016-12-13 �ϴ�ͷ������ʱ���������ҳ
*       2016-12-14 ��ȡ�û�ע����
* @version 1.0
 */
@Controller
@RequestMapping("/space")
public class MySpaceController 
{
    @Resource(name = "userServiceImpl")
    private UserService userService;
    
    @Resource(name = "articleServiceImpl")
    private ArticleService articleService;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String mySpace(HttpServletRequest request,PageInfo pageInfo,Model model) throws Exception
    {
    	String username = userService.getUsernameFromSession(request);
    	
		pageInfo.setEveryPage(12);
        Page<Article> page = articleService.getArticlesByUsername(username, pageInfo);
       	model.addAttribute("page",page);
       	model.addAttribute("userName",username);
       	
		User user = userService.findByUserName(username).get(0);
		// if the user didnot upload his picture,the path is null
		String h_pic_path = null;
		if (null != user.getH_pic_path()) {
			h_pic_path = IOUtill.getRelativePath(user.getH_pic_path());
		}
		else {
			model.addAttribute("defulat_path", "h_pics/default.jpg");
		}
		
		model.addAttribute("h_pic_path", h_pic_path);
		model.addAttribute("username", user.getUsername());
		
		// ��ȡ�û�ע����
		int[] arr = TimeUtils.getHowLongFromNow(user.getBlog_date());
		String blog_age = "";
		if (arr[0] != 0) {
			blog_age = blog_age + Integer.toString(arr[0]) + "��";
		}
		if (arr[1] != 0) {
			blog_age = blog_age + Integer.toString(arr[1]) + "����";
		}
		
		model.addAttribute("blog_age", blog_age);      	
        return "mySpace";
    }
}
