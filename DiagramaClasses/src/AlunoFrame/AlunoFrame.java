package AlunoFrame;

import Controlador.Controlador;

import javax.swing.*;

public class AlunoFrame {
    private JTextField nomeTextField;
    private JButton okButton;
    private JButton cancelarButton;
    private JTextField notaTextField;
    private Controlador controlador;
    private Aluno aluno;
    private boolean editando;

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Controlador.Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador.Controlador controlador) {
        this.controlador = controlador;
    }

    public JTextField getNotaTextField() {
        return notaTextField;
    }

    public void setNotaTextField(JTextField notaTextField) {
        this.notaTextField = notaTextField;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getOkButton() {
        return okButton;
    }

    public void setOkButton(JButton okButton) {
        this.okButton = okButton;
    }

    public JTextField getNomeTextField() {
        return nomeTextField;
    }

    public void setNomeTextField(JTextField nomeTextField) {
        this.nomeTextField = nomeTextField;
    }
    public void setControlador(){

    }

    private void thisWindowClosing(){

    }

    private void cancelarButtonActionPerformed(){

    }

    private void cancelar(){

    }

    private void okButtonActionPerformed(){

    }

    private void carregarDados(){

    }


}
