/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.introAjdcb;

import Dominio.user;
import datos.userDao;

/**
 *
 * @author Alumno Mañana
 * 
 * en el fichero de datos esta toda la informacion, el programa debe tener un procedimiento que lea
 * los datos y los meta en la bbdd
 */
public class AnimeMain {
    
    public static void main(String[] args){
        
        userDao userDao = new userDao();
        
        user u1 = new user("yaz@gmail.com","1234",false);
        System.out.println(u1);
        
        
    }
    
}
