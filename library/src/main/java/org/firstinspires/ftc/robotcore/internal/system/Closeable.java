/*
Copyright (c) 2018 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.robotcore.internal.system;

import android.support.annotation.CallSuper;

@SuppressWarnings("WeakerAccess")
public class Closeable
    {
    //----------------------------------------------------------------------------------------------
    // State
    //----------------------------------------------------------------------------------------------

    protected final Object lock = new Object();
    protected boolean closeCalled = false;
    protected int closeCount = 1;

    //----------------------------------------------------------------------------------------------
    // Construction
    //----------------------------------------------------------------------------------------------

    protected Closeable()
        {
        }

    /** @see CloseableRefCounted#enableOnlyClose()  */
    protected final void enableOnlyClose()
        {
        Assert.assertTrue(ctorOnlyCloseNeededToDestruct());
        }

    protected final boolean ctorOnlyCloseNeededToDestruct()
        {
        return true;
        }

    //----------------------------------------------------------------------------------------------
    // Explicit Closeability
    //----------------------------------------------------------------------------------------------

    public final void close()
        {
        synchronized (lock)
            {
            if (closeCount == 0)
                {
                // close() is idempotent; ignore
                }
            else
                {
                if (--closeCount == 0)
                    {
                    closeCalled = true;
                    preClose();
                    doClose();
                    postClose();
                    }
                }
            }
        }

    @CallSuper protected void preClose()
        {
        }

    @CallSuper protected void doClose()
        {
        }

    @CallSuper protected void postClose()
        {
        }
    }
