/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author carandy
 */
public interface FabricaPjAbs{
   public CascoAbs  crearCasco();
   public BotasAbs  crearBotas();
   public EscudoAbs  crearEscudo();
   public ArmaAbs  crearArma();
   public TrajeAbs  crearTraje();
}