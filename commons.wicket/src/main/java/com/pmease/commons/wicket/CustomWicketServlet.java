package com.pmease.commons.wicket;

import javax.inject.Inject;

import org.apache.wicket.protocol.http.WicketFilter;
import org.apache.wicket.protocol.http.WicketServlet;

public class CustomWicketServlet extends WicketServlet {

	private static final long serialVersionUID = 1L;
	
	private final WicketFilter wicketFilter;

	@Inject
	public CustomWicketServlet(WicketFilter wicketFilter) {
		this.wicketFilter = wicketFilter;
	}
	
	@Override
	protected WicketFilter newWicketFilter() {
		return wicketFilter;
	}

}
