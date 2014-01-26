/*
 * 
 */
package com.helloweenvsfei.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class LoopTag extends BodyTagSupport {

	private static final long serialVersionUID = 5882067091737658241L;

	private int times;

	@Override
	public int doStartTag() throws JspException {
		//times = 5;
		return super.doStartTag();
	}

	@Override
	public int doAfterBody() throws JspException {

		if (times-- > 0) {
			try {
				this.getPreviousOut().println(this.getBodyContent().getString());
				//this.pageContext.getOut().println(this.getBodyContent().getString());
				//
				System.out.print("times=["+times+"]");
				System.out.println("this.getBodyContent().getString()=" + this.getBodyContent().getString());
			} catch (Exception e) {
			}
			return EVAL_BODY_AGAIN;

		} else {
			//times = 5;
			return SKIP_BODY;
		}
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

}

// end
