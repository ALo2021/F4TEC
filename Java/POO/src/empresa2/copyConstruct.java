/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa2;

/**
 *
 * @author 55199
 */
    public class copyConstruct {                        // Construtor padrão 
        private int valor;

        // Construtor padrão
        public copyConstruct() {
            this.valor = 0;
        }

        // Construtor de cópia
        public copyConstruct(copyConstruct instancia1) { // copyconstruct se assemelha a um struct em C
            this.valor = instancia1.valor;
        }

        // Método para definir o valor
        public void setValor(int valor) {
            this.valor = valor;
        }

        // Método para obter o valor
        public int getValor() {
            return valor;
        }
    }   
