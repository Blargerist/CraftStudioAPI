package com.leviathanstudio.craftstudio.proxy;

import com.leviathanstudio.craftstudio.common.animation.AnimationHandler;
import com.leviathanstudio.craftstudio.common.animation.IAnimated;
import com.leviathanstudio.craftstudio.server.animation.ServerAnimationHandler;

import net.minecraft.profiler.Profiler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CSServerProxy extends CSCommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public AnimationHandler getNewAnimationHandler(IAnimated animated, Profiler profiler) {
        return new ServerAnimationHandler(animated, profiler);
    }
}
