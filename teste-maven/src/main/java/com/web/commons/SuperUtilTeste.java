package com.web.commons;

import org.junit.Test;

import junit.framework.Assert;

public class SuperUtilTeste {

	@SuppressWarnings("deprecation")
	@Test
	public void escapeHTMLTest() {
		String escapedHtml = SuperUtil.escapeHTML("<script>alert(1);</script>");

		String expected = "&lt;script&gt;alert(1);&lt;/script&gt;";
		Assert.assertEquals(expected, escapedHtml);
	}
}
