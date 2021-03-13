/*
*                     GNU GENERAL PUBLIC LICENSE
*                        Version 3, 29 June 2007
* 
*  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
*  Everyone is permitted to copy and distribute verbatim copies
*  of this license document, but changing it is not allowed.
* 
*                             Preamble
* 
*   The GNU General Public License is a free, copyleft license for
* software and other kinds of works.
* 
*   The licenses for most software and other practical works are designed
* to take away your freedom to share and change the works.  By contrast,
* the GNU General Public License is intended to guarantee your freedom to
* share and change all versions of a program--to make sure it remains free
* software for all its users.  We, the Free Software Foundation, use the
* GNU General Public License for most of our software; it applies also to
* any other work released this way by its authors.  You can apply it to
* your programs, too.
*
* Nombre de archivo: ProductRepository.java 
* Autor: salvgonz 
* Fecha de creación: Mar 13, 2021 
*/

package com.tocode.mx.application.repository;

import com.tocode.mx.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * The Interface ProductRepository.
 */
public interface ProductRepository extends JpaRepository<Product, String> {
  
  /**
   * Find all.
   *
   * @return the list
   */
  List<Product> findAll();
}
