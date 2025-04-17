package com.eight.P19_mediatorPattern.components;

import com.eight.P19_mediatorPattern.mediators.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
