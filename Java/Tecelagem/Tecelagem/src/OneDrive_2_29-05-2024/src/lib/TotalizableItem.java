/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author Usuario
 */
public interface TotalizableItem extends PrintableItem
{
    // Em um interface todos os método são sempre públicos e abstratos.
    // Por esse motivo os qualificadores public e abstract são sempre omitidos.
    
    // Atributos são possíveis, mas são sempre públicos e finais (constantes).
    double pi= 3.1416;
    
    // Retorna o valor que será utilizado na totalização
    double totalizableValue();
}
