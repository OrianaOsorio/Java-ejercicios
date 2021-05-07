public class binaria
{
        public static void main (String[] args)
        {
	int size=0;
	int[] T;
	int L;
	int key ;
	boolean found;
	System.out.print("Tamaño del arreglo =>");
	size=Leer.datoint();

	T=new int[size];

	for (int i=0;i<=size-1;i++)
	{
		T[i]=Leer.datoint();;
	}
	System.out.print("elemento a buscar =>");
	key=Leer.datoint();


	int bott, top, mid ; 
	bott = 0 ; top = size -1 ; 
	L = ( top + bott ) / 2 ; 
	if (T[L] == key) 
	found = true ; 
	else 
	found = false ; 
	while (bott <=top && !found) 
	{ 
		mid = top + bott / 2 ; 
		if ( T [mid] == key ) 
		{ 
			found = true; 
			L = mid ; 
		} 

		else if (T [mid] < key ) 
		bott = mid + 1 ; 
		else 
		top = mid-1 ; 
	} 

	if (found==true)
	{
		System.out.print("si se encuentra el elemento");
	}
	else
	{
		System.out.print("no se encuentra el elemento");
	}

	}
}
