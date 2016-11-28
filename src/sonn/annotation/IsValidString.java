package sonn.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

import sonn.util.StringUtill;

/**
* @ClassName: IsValidString 
* @Description: �Զ���ע��ʵ��ǰ��̨����У�飬�ж��Ƿ�����Ƿ��ַ�
* @author ����
* @date 2016-7-25 ����8:22:58  
* @version 1.0
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsValidString.ValidStringChecker.class)
@Documented
public @interface IsValidString 
{
	String message() default "The string is invalid.";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default{};
	
	class ValidStringChecker implements ConstraintValidator<IsValidString,String>
	{

		@Override
		public void initialize(IsValidString arg0)
		{	
		}

		@Override
		public boolean isValid(String strValue, ConstraintValidatorContext context)
		{
			if(StringUtill.isStringEmpty(strValue))
			{
				return true;
			}
			if(strValue.contains("<") || strValue.contains(">")
					|| strValue.contains("=") || strValue.contains("'") || strValue.contains("\""))
			{
				return false;
			}
			return true;
		}
		
	}
}
