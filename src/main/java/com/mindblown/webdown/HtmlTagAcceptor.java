package com.mindblown.webdown;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beamj
 */
public interface HtmlTagAcceptor {
    boolean accept(HtmlTag tag, String type);
}
