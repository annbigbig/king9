/*
 * 
 */
package com.helloweenvsfei.tags2;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ToUpperCaseTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {

		// 將 標籤體內容讀入該 writer
		StringWriter writer = new StringWriter();

		// 標籤體 為 JspFragment 的形式
		JspFragment jspFragment = this.getJspBody();
		
		// 透過 invoke 輸出到指定的 writer 中。
		// 如果參數為 null，將輸出到預設的 writer 中，即 getJspContext().getOut() 輸出到HTML中
		jspFragment.invoke(writer);

		String content = writer.getBuffer().toString();
		this.getJspContext().getOut().print(content.toUpperCase());
	}

}

// end
