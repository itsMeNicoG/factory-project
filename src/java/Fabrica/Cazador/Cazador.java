/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica.Cazador;

import Fabrica.ArmaAbs;
import Fabrica.BotasAbs;
import Fabrica.CascoAbs;
import Fabrica.EscudoAbs;
import Fabrica.FabricaPjAbs;
import Fabrica.TrajeAbs;
/**
 *
 * @author carandy
 */
public class Cazador implements FabricaPjAbs  {
    static private Cazador singletonHunter;

    public static FabricaPjAbs getSingleton() {
            if(singletonHunter==null){
            singletonHunter=new Cazador();
        }
        return singletonHunter;       
    }
    
    private Cazador(){
        super();
    }
    


    @Override
    public CascoAbs crearCasco() {
        return new CascoDelPantano();        
    }

    @Override
    public BotasAbs crearBotas() {
        return new BotasDelPantano();
    }

    @Override
    public EscudoAbs crearEscudo() {
        return new EscudoDelPantano();
    }
    @Override
    public ArmaAbs crearArma() {
        return new ArcoDelPantano();
    }

    @Override
    public TrajeAbs crearTraje() {
        return new PecheraDelPantano();
    }
}
