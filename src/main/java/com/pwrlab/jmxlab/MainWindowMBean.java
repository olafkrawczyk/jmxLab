/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwrlab.jmxlab;

/**
 *
 * @author Olaf
 */
public interface MainWindowMBean {
    
    public void setWordsMap(String wordsMap);
    public String getWordsMap();
    public boolean checkIfForbiddenWords();
    public void replaceForbiddenWords();
    
    
}
