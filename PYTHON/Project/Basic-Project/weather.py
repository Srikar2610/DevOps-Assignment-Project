import requests
API_KEY = "your_api_key" # Get from https://openweathermap.org/api
city = input("Enter city name: ")
url = 
f"http://api.openweathermap.org/data/2.5/weather?q={city}&appid={API
_KEY}&units=metric"
response = requests.get(url).json()
if response["cod"] == 200:
 print(f"City: {response['name']}")
 print(f"Temperature: {response['main']['temp']}°C")
 print(f"Weather: {response['weather'][0]['description']}")
else:
 print("City not found!")
