/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrobd;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorena Sanches
 */
public class CadastroBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CadastroBDTeste bdTeste = new CadastroBDTeste();
//            bdTeste.CriarPessoaFisica();
//            bdTeste.AlterarPessoaFisica();
//            bdTeste.ListarPessoasFisicas();
//            bdTeste.ExcluirPessoaFisica();
//            bdTeste.CriarPessoaJuridica();
//            bdTeste.AlterarPessoaJuridica();
//            bdTeste.ListarPessoasJuridicas();
            bdTeste.ExcluirPessoaJuridica();


        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastroBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }
}
