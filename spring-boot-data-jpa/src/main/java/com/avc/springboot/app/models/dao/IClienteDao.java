package com.avc.springboot.app.models.dao;

import java.util.List;

import com.avc.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
}