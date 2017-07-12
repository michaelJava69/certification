    package packageX.packageY;

import packageX.SuperclassX;

public class Count extends SuperclassX
    {
        SuperclassX objX = new Count();
        Count objY = new Count();
        void subclassMethodY()
        {
            objY.superclassMethodX();
            int i;
            i = objY.superclassVarX;
        }    
    }

