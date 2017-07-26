package com.grupoatrium.persistencia.impl;

public class EditorialesDao {
	
	private ConnectionMgr connMgr;

	/**
	 * @return the connMgr
	 */
	public ConnectionMgr getConnMgr() {
		return connMgr;
	}

	/**
	 * @param connMgr the connMgr to set
	 */
	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EditorialesDao [connMgr=" + connMgr + "]";
	}
	
}
