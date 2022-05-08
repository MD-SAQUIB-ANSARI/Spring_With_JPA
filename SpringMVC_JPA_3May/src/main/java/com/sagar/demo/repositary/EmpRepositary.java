package com.sagar.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.demo.model.Empl;

public interface EmpRepositary extends JpaRepository<Empl, Integer>
{
}
