/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.facade;

import ec.edu.ups.entidades.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author johan
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario>{
    
    @PersistenceContext(name = "PlataformasWeb")
    private EntityManager em;

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
return em;
    }
    
    
}
