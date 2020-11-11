/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.controllers;

import br.edu.unijuazeiro.progiii.sales.infrastructure.CustomersDB;
import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leonardo
 *
 */
@WebServlet("/old")
public class CustomersControllerOld extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String cpf = req.getParameter("cpf");
        String action = req.getParameter("action");

        Customer customer = new Customer();
        customer.setCpf(cpf);
        customer.setName(name);
        System.out.println(customer.getId());
//        CustomerApplication customerApplication = new CustomerApplication();
//        customerApplication.save(customer);
//        CustomersDB customersDB = new CustomersDB(getServletContext());
 
        resp.sendRedirect("customers.jsp");
    }

    // GET /customers?id=34234234
    //
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
//        CustomersDB customersDB = new CustomersDB(getServletContext());
//        Customer customerFromDB = customersDB.findById(id);
//        getServletContext().setAttribute("customerToUpdate", customerFromDB);
        resp.sendRedirect("update.jsp");
    }

}
