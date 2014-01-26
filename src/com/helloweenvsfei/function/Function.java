/*
 * 
 */
package com.helloweenvsfei.function;

import java.util.Collection;

public class Function {

	/**
	 * 傳回字節長度
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static int length(Object obj) {

		if (obj == null)
			return 0;

		if (obj instanceof StringBuffer) {
			return length(((StringBuffer) obj).toString());
		}

		if (obj instanceof String) {
			return ((String) obj).getBytes().length;
		}

		if (obj instanceof Collection) {
			return ((Collection) obj).size();
		}

		return 0;
	}

	public static String substring(String str, int byteLength) {

		if (str == null)
			return "";

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (length(buffer.toString() + ch) > byteLength) {
				break;
			} else {
				buffer.append(ch);
			}
		}

		return buffer.toString();
	}

	public static void main(String[] args) {

		System.out.println(length("中文測試"));

		System.out.println(substring("中文測試", 5));

	}

}

// end
