import java.util.HashMap;
import java.util.Map;

class TWOSUM {
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> nums_map = new HashMap<>();		//CREATE A HASH MAP SO THAT WE CAN STORE THE GIVEN ARRAY
	    
	    for(int i = 0; i < nums.length; i ++){			//START LOOPING THROUGH THE ARRAY 
		int compliment = target - nums[i];			//WE NEED TO FIND THE COMPLIMENT OF THE CURRENT INDEX VALUE AGAINT OUR TARGET.
		
		if(nums_map.containsKey(compliment)){			//WE SEARCH THE HASH MAP OF OUR SAVED INDICES AND VALUES TO CHECK TO SEE IF WE HAVE THE COMPLIMENT. IF WE DO THAT MEANS WE FOUND OUR ANSWER. RETURN THE VALUES 
		    return new int[] {nums_map.get(compliment), i};
		}
		nums_map.put(nums[i],i);				//OTHERWISE WE ADD THE CURRENT INDEX AND VALUE ON MOVE TO NEXT.
	    }
	    throw new IllegalArgumentException("No Match Found!");	//INSTEAD OF RETURN STATEMENT HERE WE THROW AN ERROR BECAUSE WE SHOULD NEVER REACH THIS POINT
	}
    }