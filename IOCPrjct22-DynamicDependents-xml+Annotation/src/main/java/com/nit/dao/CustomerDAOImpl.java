package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.bo.CustomerBo;
@Repository("custDAO")
public final class CustomerDAOImpl implements ICustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO  REALTIME_CUSTOMER(CNAME,CADD,PAMNT,INTRAMNT)"+"VALUES(?,?,?,?);";

	// HAS A PRoperty
	@Autowired
	private DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl- 1 param Costructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBo custBO) throws Exception {
		int count = 0;

		// get Pooled JDBC Connection
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);) {
			if (ps != null) {
				// set values to query data param by collecting the data from BO class object
				ps.setString(1, custBO.getCname());
				ps.setString(2, custBO.getCadd());
				ps.setDouble(3, custBO.getPamnt());
				ps.setDouble(4, custBO.getIntramt());

				count = ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;

	}

}
