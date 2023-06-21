package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nit.bo.PatientBo;

public final class PatientDAOImpl implements IPatientDAO {
	private static final String PATIENT_INSERT_QUERY = "INSERT INTO  DETAILS_OF_CORONA_PATIENT(PNAME,PADD,DAYS,PDCHRG,TAMT)"+"VALUES(?,?,?,?,?);";

	// HAS A PRoperty
	private DataSource ds;

	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAOImpl- 1 param Costructor");
		this.ds = ds;
	}

	@Override
	public int insert(PatientBo pBO) throws Exception {
		int count = 0;

		// get Pooled JDBC Connection
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(PATIENT_INSERT_QUERY);) {
			if (ps != null) {
				// set values to query data param by collecting the data from BO class object
				ps.setString(1, pBO.getPname());
				ps.setString(2, pBO.getPadd());
				ps.setDouble(3, pBO.getDays());
				ps.setDouble(4, pBO.getPdchrg());
				ps.setDouble(5, pBO.getTamt());
				
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
