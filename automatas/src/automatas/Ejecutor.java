package automatas;


public class Ejecutor {
    public static void main(String[] args) {
        Conjunto ca = new Conjunto();
        //Operaciones basicas----operaciones conjuntivistas
        for(int i=1; i<=10; i++){
            ca.inserta((Integer)i);
        }
        System.out.println("El Conjunto A es: "+ca.getA());
        ca.inserta(6);
        ca.elimina(3);
        System.out.println("El Conjunto A es: "+ca.getA());
        //Operaciones de subconjuntos
        System.out.println("Subconjuntoos mayores:"+ca.subconjuntosup(5));
        System.out.println("Subconjuntoos menores:"+ca.subconjuntoinf(8));
        System.out.println("Subconjuntoe:"+ca.subconjuntoentre(2,9));
        //Operaciones con conjuntos
        Conjunto cb=new Conjunto();
        //cb.inserta(6);
        cb.inserta(11);
        cb.inserta(12);
        System.out.println("Conjunto B:"+cb.getA());
        System.out.println("Union A Y B: "+ca.union(ca.a, cb.a));
        System.out.println("Conjuntocca.getA()");
        Conjunto cc=new Conjunto();
        cc.inserta(7);
        cc.inserta(8);
        cc.inserta(15);
        System.out.println("Conjunto C: "+cc.getA());
        System.out.println("Arseccion C :"+ca.interseccion(ca.a, cc.a));
        System.out.println("C:"+cc.diferencia(cc.a, ca.a));
        System.out.println("Conjuntocca.getA()");
        System.out.println("Conjuntoccb.getA()");
        System.out.println("Conjuntoccc.getA()");
        
        System.out.println("Complemento A Y B:"+cb.complemento(cb.a, ca.a));
        
        System.out.println("Complemento A Y C:"+ca.complemento(cc.a, ca.a));
        
        
        
        
        if(ca.equals(cb)){
            System.out.println("Son iguales");
        }
        else
        {
            
            System.out.println("No son iguales los elementos del conjunto A Y B");
        }
        
        if(ca.equals(cc)){
            System.out.println("Son iguales");
        }
        else
        {

            System.out.println("No son iguales los elementos del conjunto A Y C");
        }    
        
        if(ca.equals(ca)){
            System.out.println("Son iguales A Y A (Se usó para comprobar que la igualdad es verdadera)");
        }
        else
        {
            System.out.println("No son iguales los elementos del conjunto A Y C");
        }          

        
    }
     }
