	int i,j,counter;
	i=j=0;
	counter=1;
	int arr[]={2,5,4,7,3,4,5,1,7,6,9,10,11,4,1,5,33,34,35,36,2,1,4,4,5,6,4};
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]+1==arr[i+1]&&arr[i+1]+1==arr[i+2])
		{
			counter++;
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i]+" ");
				i++;
			}
			
			}
		}
	System.out.print("found"+counter+"groups");
	}
	
		}
