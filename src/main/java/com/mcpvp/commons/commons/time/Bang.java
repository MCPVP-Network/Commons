package com.mcpvp.commons.commons.time;

import com.mcpvp.commons.commons.server.Console;

/**
 * quick easy to use time watcher
 */
public class Bang
{
    private long startTime = 0;
    private String name;

    public Bang(String name)
    {
        this.name = "Bang " + name;
    }

    public Bang start()
    {
        this.startTime = System.currentTimeMillis();

        return this;
    }

    public void stop()
    {
        long diff = System.currentTimeMillis() - this.startTime;
        Console.log(this.name, "It took " + diff + "ms!");
    }
}
