
package personas;

import java.util.*;

public class ListaPersonas {
    Vector listaPersonas; // Atributo que identifica un vector de personas

public ListaPersonas() {
    listaPersonas = new Vector(); 
}

public void añadirPersona(Persona p) {
    listaPersonas.add(p);
}
public void eliminarPersona(int index) {
    listaPersonas.removeElementAt(index);
}

public void borrarLista() {
    listaPersonas.removeAllElements();
}

}