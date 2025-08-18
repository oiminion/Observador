/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.mavenproject1.Model;

import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Mercado implements Subject{
    private ArrayList<Acao> stage;
    private ArrayList<Observer>Observers;
    
    public Mercado()
    {
        this.stage = new ArrayList<>();
        this.Observers = new ArrayList<>();
    }
    
    public void Subscribe(Observer observer)
    {
        Observesrs.Add(observer);
    }
    public void Unsubscribe()
    {
        
    }
    public void Notify()
    {
        
    }
    public void SetStage(int pos, float new)
    {
        this.stage.set(pos, );
    }
    public float GetStage()
    {
    
    }
}
