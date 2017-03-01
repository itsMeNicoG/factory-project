/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica.Brujo;

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
public class Brujo implements FabricaPjAbs  {
    static private Brujo singletonWizzard;
    
    private Brujo(){
        super();
    }
    
    public static FabricaPjAbs getSingleton() {
        if(singletonWizzard==null){
            singletonWizzard=new Brujo();
        }
        return singletonWizzard;       
    }

    @Override
    public CascoAbs crearCasco() {
        return new CascoDelOlvido();
    }

    @Override
    public BotasAbs crearBotas() {
        return new BotasDelOlvido();
    }

    @Override
    public EscudoAbs crearEscudo() {
        return new EscudoDelOlvido();
    }

    @Override
    public ArmaAbs crearArma() {
        return new VaraDelOlvido();
    }

    @Override
    public TrajeAbs crearTraje() {
        return new TrajeDelOlvido();
    }
    
}
