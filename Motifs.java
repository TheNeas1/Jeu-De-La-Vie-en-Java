public class Motifs {
    
    // Motif Bloc (2x2)
    public static final Motif BLOCK = new Motif(new Cellule[][] {
        { new Cellule(true), new Cellule(true) },
        { new Cellule(true), new Cellule(true) }
    });

    // Motif Grenouille (4x4)
    public static final Motif FROG = new Motif(new Cellule[][] {
        { new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(true) },
        { new Cellule(true), new Cellule(true), new Cellule(true), new Cellule(false) }
    });

    // Motif Planeur (5x5)
    public static final Motif GLIDER = new Motif(new Cellule[][] {
        { new Cellule(true), new Cellule(false), new Cellule(false) },
        { new Cellule(true), new Cellule(false), new Cellule(true)},
        { new Cellule(true), new Cellule(true), new Cellule(false) }
    });


    public static final Motif CANON_DE_GOSPER = new Motif(new Cellule[][] {
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false) },
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false) },
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true) },
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true) },
        { new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false) },
        { new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false) },
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false) },
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false) },
        { new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(true), new Cellule(true), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false), new Cellule(false)}
        
        });



}
    
    


    

