package Visitor;

import Dominio.*;

public interface CartaVisitor {
	int visitar(Energy e);
	int visitar(Item i);
	int visitar(Pokemon p);
	int visitar(Supporter s);
}
