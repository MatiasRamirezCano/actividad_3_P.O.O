package ejercicio_mdi;

public class MDI_Principal extends javax.swing.JFrame {
    
    jpCirculo formulario_circulo = new jpCirculo();
    jpCuadrado formulario_cuadrado = new jpCuadrado();
    jpRectangulo formulario_rectangulo = new jpRectangulo();
    jpTriangulo formulario_triangulo = new jpTriangulo();
    jpRombo formulario_rombo = new jpRombo();
    jpTrapecio formulario_trapecio = new jpTrapecio();
    
    void inicializar_formularios(){
        jifCirculo.setContentPane(formulario_circulo);
        formulario_circulo.setSize(300, 300);
        jifCirculo.setSize(300, 300);
        
        jifCuadrado.setContentPane(formulario_cuadrado);
        formulario_cuadrado.setSize(300, 300);
        jifCuadrado.setSize(300, 300);
        
        jifRectangulo.setContentPane(formulario_rectangulo);
        formulario_rectangulo.setSize(300, 300);
        jifRectangulo.setSize(300, 300);
        
        jifTriangulo.setContentPane(formulario_triangulo);
        formulario_triangulo.setSize(300, 300);
        jifTriangulo.setSize(300, 300);
        
        jifRombo.setContentPane(formulario_rombo);
        formulario_rombo.setSize(300, 300);
        jifRombo.setSize(300, 300);
        
        jifTrapecio.setContentPane(formulario_trapecio);
        formulario_trapecio.setSize(300, 300);
        jifTrapecio.setSize(300, 300);
    }

    public MDI_Principal() {
        initComponents();
        this.inicializar_formularios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jifCirculo = new javax.swing.JInternalFrame();
        jifCuadrado = new javax.swing.JInternalFrame();
        jifRectangulo = new javax.swing.JInternalFrame();
        jifTriangulo = new javax.swing.JInternalFrame();
        jifRombo = new javax.swing.JInternalFrame();
        jifTrapecio = new javax.swing.JInternalFrame();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jmiCirculo = new javax.swing.JMenuItem();
        jmiCuadrado = new javax.swing.JMenuItem();
        jmiRectangulo = new javax.swing.JMenuItem();
        jmiTriangulo = new javax.swing.JMenuItem();
        jmiRombo = new javax.swing.JMenuItem();
        jmiTrapecio = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(0, 204, 204));

        jifCirculo.setClosable(true);
        jifCirculo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifCirculo.setVisible(false);

        javax.swing.GroupLayout jifCirculoLayout = new javax.swing.GroupLayout(jifCirculo.getContentPane());
        jifCirculo.getContentPane().setLayout(jifCirculoLayout);
        jifCirculoLayout.setHorizontalGroup(
            jifCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jifCirculoLayout.setVerticalGroup(
            jifCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        desktopPane.add(jifCirculo);
        jifCirculo.setBounds(0, 0, 220, 160);

        jifCuadrado.setClosable(true);
        jifCuadrado.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifCuadrado.setVisible(false);

        javax.swing.GroupLayout jifCuadradoLayout = new javax.swing.GroupLayout(jifCuadrado.getContentPane());
        jifCuadrado.getContentPane().setLayout(jifCuadradoLayout);
        jifCuadradoLayout.setHorizontalGroup(
            jifCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifCuadradoLayout.setVerticalGroup(
            jifCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifCuadrado);
        jifCuadrado.setBounds(0, 0, 250, 210);

        jifRectangulo.setClosable(true);
        jifRectangulo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRectangulo.setVisible(false);

        javax.swing.GroupLayout jifRectanguloLayout = new javax.swing.GroupLayout(jifRectangulo.getContentPane());
        jifRectangulo.getContentPane().setLayout(jifRectanguloLayout);
        jifRectanguloLayout.setHorizontalGroup(
            jifRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifRectanguloLayout.setVerticalGroup(
            jifRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifRectangulo);
        jifRectangulo.setBounds(10, 10, 150, 170);

        jifTriangulo.setClosable(true);
        jifTriangulo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifTriangulo.setVisible(false);

        javax.swing.GroupLayout jifTrianguloLayout = new javax.swing.GroupLayout(jifTriangulo.getContentPane());
        jifTriangulo.getContentPane().setLayout(jifTrianguloLayout);
        jifTrianguloLayout.setHorizontalGroup(
            jifTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifTrianguloLayout.setVerticalGroup(
            jifTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifTriangulo);
        jifTriangulo.setBounds(170, 10, 160, 170);

        jifRombo.setClosable(true);
        jifRombo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRombo.setVisible(false);

        javax.swing.GroupLayout jifRomboLayout = new javax.swing.GroupLayout(jifRombo.getContentPane());
        jifRombo.getContentPane().setLayout(jifRomboLayout);
        jifRomboLayout.setHorizontalGroup(
            jifRomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifRomboLayout.setVerticalGroup(
            jifRomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifRombo);
        jifRombo.setBounds(360, 10, 140, 160);

        jifTrapecio.setClosable(true);
        jifTrapecio.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifTrapecio.setVisible(false);

        javax.swing.GroupLayout jifTrapecioLayout = new javax.swing.GroupLayout(jifTrapecio.getContentPane());
        jifTrapecio.getContentPane().setLayout(jifTrapecioLayout);
        jifTrapecioLayout.setHorizontalGroup(
            jifTrapecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifTrapecioLayout.setVerticalGroup(
            jifTrapecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifTrapecio);
        jifTrapecio.setBounds(60, 180, 160, 100);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Formularios");

        jmiCirculo.setText("Circulo");
        jmiCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCirculoActionPerformed(evt);
            }
        });
        fileMenu.add(jmiCirculo);

        jmiCuadrado.setText("Cuadrado");
        jmiCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCuadradoActionPerformed(evt);
            }
        });
        fileMenu.add(jmiCuadrado);

        jmiRectangulo.setText("Rectangulo");
        jmiRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRectanguloActionPerformed(evt);
            }
        });
        fileMenu.add(jmiRectangulo);

        jmiTriangulo.setText("Triangulo");
        jmiTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrianguloActionPerformed(evt);
            }
        });
        fileMenu.add(jmiTriangulo);

        jmiRombo.setText("Rombo");
        jmiRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRomboActionPerformed(evt);
            }
        });
        fileMenu.add(jmiRombo);

        jmiTrapecio.setText("Trapecio");
        jmiTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrapecioActionPerformed(evt);
            }
        });
        fileMenu.add(jmiTrapecio);

        jmiSalir.setMnemonic('x');
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        fileMenu.add(jmiSalir);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCirculoActionPerformed
        jifCirculo.setVisible(true);
    }//GEN-LAST:event_jmiCirculoActionPerformed

    private void jmiCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCuadradoActionPerformed
        jifCuadrado.setVisible(true);
    }//GEN-LAST:event_jmiCuadradoActionPerformed

    private void jmiRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRectanguloActionPerformed
        jifRectangulo.setVisible(true);
    }//GEN-LAST:event_jmiRectanguloActionPerformed

    private void jmiTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrianguloActionPerformed
        jifTriangulo.setVisible(true);
    }//GEN-LAST:event_jmiTrianguloActionPerformed

    private void jmiRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRomboActionPerformed
        jifRombo.setVisible(true);
    }//GEN-LAST:event_jmiRomboActionPerformed

    private void jmiTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrapecioActionPerformed
        jifTrapecio.setVisible(true);
    }//GEN-LAST:event_jmiTrapecioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JInternalFrame jifCirculo;
    private javax.swing.JInternalFrame jifCuadrado;
    private javax.swing.JInternalFrame jifRectangulo;
    private javax.swing.JInternalFrame jifRombo;
    private javax.swing.JInternalFrame jifTrapecio;
    private javax.swing.JInternalFrame jifTriangulo;
    private javax.swing.JMenuItem jmiCirculo;
    private javax.swing.JMenuItem jmiCuadrado;
    private javax.swing.JMenuItem jmiRectangulo;
    private javax.swing.JMenuItem jmiRombo;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiTrapecio;
    private javax.swing.JMenuItem jmiTriangulo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}