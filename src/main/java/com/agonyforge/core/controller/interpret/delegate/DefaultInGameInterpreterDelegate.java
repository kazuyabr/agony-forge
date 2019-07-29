package com.agonyforge.core.controller.interpret.delegate;

import com.agonyforge.core.config.LoginConfiguration;
import com.agonyforge.core.controller.Input;
import com.agonyforge.core.controller.Output;
import com.agonyforge.core.controller.interpret.Interpreter;
import com.agonyforge.core.model.Connection;
import com.agonyforge.core.model.Creature;
import com.agonyforge.core.model.repository.CreatureRepository;
import com.agonyforge.core.service.CommService;

public class DefaultInGameInterpreterDelegate implements InGameInterpreterDelegate {
    private CreatureRepository creatureRepository;
    private LoginConfiguration loginConfiguration; // TODO need to break this configuration apart
    private CommService commService;

    public DefaultInGameInterpreterDelegate(
        CreatureRepository creatureRepository,
        LoginConfiguration loginConfiguration,
        CommService commService) {

        this.creatureRepository = creatureRepository;
        this.loginConfiguration = loginConfiguration;
        this.commService = commService;
    }

    @Override
    public Output interpret(Interpreter primary, Input input, Connection connection) {
        Output output = new Output();
        Creature creature = creatureRepository
            .findByConnection(connection)
            .orElseThrow(() -> new NullPointerException("Unable to find Creature for Connection " + connection.getId()));

        output
            .append("[green]You gossip '" + input.toString() + "[green]'")
            .append(primary.prompt(connection));

        commService.echoToWorld(new Output("[green]" + connection.getName() + " gossips '" + input.toString() + "[green]'"), primary, creature);

        return output;
    }

    @Override
    public Output prompt(Interpreter primary, Connection connection) {
        return new Output("", loginConfiguration.getPrompt("inGame", connection));
    }
}