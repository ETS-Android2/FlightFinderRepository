import requests

params = {
  'access_key': 'a040cf28d6f8b0e66f379a3f82fad839'
}

api_result = requests.get('http://api.aviationstack.com/v1/flights', params)

api_response = api_result.json()

api_response['pagination']['limit'] = 2
api_response['pagination']['count'] = 2
api_response['pagination']['total'] = 5



print(api_response)

# for flight in api_response['data']:
#     if (flight['live']['is_ground'] is False):
#         print(u'%s flight %s from %s (%s) to %s (%s) is in the air.' % (
#             flight['airline']['name'],
#             flight['flight']['iata'],
#             flight['departure']['airport'],
#             flight['departure']['iata'],
#             flight['arrival']['airport'],
#             flight['arrival']['iata']))