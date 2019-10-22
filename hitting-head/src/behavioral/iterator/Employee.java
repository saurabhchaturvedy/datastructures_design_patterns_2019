package behavioral.iterator;

public class Employee implements Iterable {

	private String[] employees = { "John", "Sandeep", "Deepa", "Christian", "Sheefa" };

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new EmployeeIterator();
	}

	private class EmployeeIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			while (index < employees.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext())
				return employees[index++];
			return null;
		}

	}

}
