package com.trophonix.tradeplus.events;

import com.trophonix.tradeplus.trade.Trade;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public class TradeCompleteEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private Player playerOne, playerTwo;
    private Set<ItemStack> playerOneTrades, playerTwoTrades;

    public TradeCompleteEvent(Trade trade, Player playerOne, Player playerTwo, Set<ItemStack> playerOneTrades, Set<ItemStack> playerTwoTrades) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerOneTrades = playerOneTrades;
        this.playerTwoTrades = playerTwoTrades;
    }

    public Player getPlayerOne() { return playerOne; }

    public Player getPlayerTwo() { return playerTwo; }

    public Set<ItemStack> getPlayerOneTrades() { return playerOneTrades; }

    public Set<ItemStack> getPlayerTwoTrades() { return playerTwoTrades; }

    @Override
    public HandlerList getHandlers()
    {
        return handlers;
    }

    public static HandlerList getHandlerList()
    {
        return handlers;
    }

}
